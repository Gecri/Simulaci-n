/**
 * ***************************************************************
 * JADE - Java Agent DEvelopment Framework is a framework to develop
 * multi-agent systems in compliance with the FIPA specifications.
 * Copyright (C) 2000 CSELT S.p.A.
 *
 * GNU Lesser General Public License
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation,
 * version 2.1 of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA  02111-1307, USA.
 * **************************************************************
 */

package examples.behaviours;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;

public class SimpleAgent extends Agent {

  protected void setup() {
    System.out.println("Agent "+getLocalName()+" started.");

    // Add the CyclicBehaviour
    addBehaviour(new CyclicBehaviour(this) {
      public void action() {
        // System.out.println("Date");
      }
    });
    // Add the generic behaviour
    addBehaviour(new FourStepBehaviour());
  }

  private class FourStepBehaviour extends Behaviour {
    DiscreteMaths discreteMaths = new DiscreteMaths();
    Correlation correlation = new Correlation();
    DataSet dataSet = new DataSet();
    private int step = 1;

    public void action() {
      switch (step) {
        case 1:

          float b1 = discreteMaths.B1(dataSet.getX(), dataSet.getY());
          float b0 = discreteMaths.B0(dataSet.getX(), dataSet.getY(), b1);
          float prediccion = discreteMaths.SLR(b1, b0);
          float correla = correlation.coeficienteCorrelacion(dataSet.getX(), dataSet.getY());

          System.out.println();
          System.out.println("Primera Operacion: ");
          System.out.println("SLR: "+prediccion);
          System.out.println("Correlacion: " +correlation.coeficienteCorrelacion(dataSet.getX(), dataSet.getY()));
          System.out.println("Determinacion: " +correlation.coeficienteDeterminacion(dataSet.getX(), dataSet.getY(), correla));
          System.out.println();
          break;

        case 2:

          float bb1 = discreteMaths.B1(dataSet.getZ(), dataSet.getW());
          float bb0 = discreteMaths.B0(dataSet.getZ(), dataSet.getW(), bb1);
          float prediccion1 = discreteMaths.SLR(bb1, bb0);
          float correla1 = correlation.coeficienteCorrelacion(dataSet.getZ(), dataSet.getW());

          System.out.println("Segunda Operacion: ");
          System.out.println("SLR: " + prediccion1);
          System.out.println("Correlacion: " +correlation.coeficienteCorrelacion(dataSet.getZ(), dataSet.getW()));
          System.out.println("Determinacion: " +correlation.coeficienteDeterminacion(dataSet.getZ(), dataSet.getW(), correla1));
          System.out.println();

          myAgent.addBehaviour(new OneShotBehaviour(myAgent) {
            public void action() {

            }
          });
          break;

        case 3:

          float bOne = discreteMaths.B1(dataSet.getIndiasX(), dataSet.getIndiasY());
          float bCero = discreteMaths.B0(dataSet.getIndiasX(), dataSet.getIndiasY(), bOne);
          float indiasprediccion = discreteMaths.SLR(bOne,bCero);
          float indiascorrelation = correlation.coeficienteCorrelacion(dataSet.getIndiasX(), dataSet.getIndiasY());

          System.out.println("Tercer Operacion");
          System.out.println("SLR: " + indiasprediccion);
          System.out.println("Correlacion: " +correlation.coeficienteCorrelacion(dataSet.getIndiasX(), dataSet.getIndiasY()));
          System.out.println("Determinacion: " +correlation.coeficienteDeterminacion(dataSet.getIndiasX(), dataSet.getIndiasY(), indiascorrelation));
          System.out.println();

      }
      step++;
    }

    public boolean done() {
      return step == 4;
    }

    public int onEnd() {
      myAgent.doDelete();
      System.out.println("Death Agent");
      return super.onEnd();
    }
  }    // END of inner class FourStepBehaviour
}