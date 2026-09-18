package com.example.retobackendjrr.component;

import com.example.retobackendjrr.service.LiquidacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SimuladorRunner implements CommandLineRunner {

    @Autowired
    private LiquidacionService liquidacionService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n==================================================");
        System.out.println("   RETO: SIMULADOR DE TARIFAS Y LIQUIDACIÓN       ");
        System.out.println("==================================================");

        double horasTrabajadas = 40.0;
        double valorBase = 30000.0;

        double totalLiquidacion = liquidacionService.calcularTarifa(horasTrabajadas, valorBase);

        System.out.println(">> Horas Registradas: " + horasTrabajadas);
        System.out.println(">> Tarifa Base por Hora: $" + valorBase);
        System.out.println(">> TOTAL LIQUIDACIÓN INSTITUCIONAL: $" + totalLiquidacion);
        System.out.println("==================================================\n");
    }
}