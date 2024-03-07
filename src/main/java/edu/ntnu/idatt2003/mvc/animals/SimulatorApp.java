package edu.ntnu.idatt2003.mvc.animals;

import edu.ntnu.idatt2003.mvc.animals.controller.Simulator;

public class SimulatorApp {

  public static void main(String[] args) {

    Simulator simulator = new Simulator();
    simulator.runLongSimulation();
  }

}
