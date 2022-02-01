package com.sparta.factory;

import com.sparta.factory.controller.VehicleController;
import com.sparta.factory.model.*;
import com.sparta.factory.view.VehicleView;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        VehicleView view = new VehicleView();
        String desiredVehicleType = view.getDesiredVehicle();
        VehicleController controller = new VehicleController();
        String result = controller.initiateDriving(desiredVehicleType);
        view.displayResults(result);
    }
}
