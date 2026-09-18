package com.example.retobackendjrr.service;

import org.springframework.stereotype.Service;

@Service
public class LiquidacionService {

    // Lógica de negocio y cálculos matemáticos para el reto
    public double calcularTarifa(double horas, double tarifaBase) {
        double recargoInstitucional = 1.15; // Factor de liquidación
        return (horas * tarifaBase) * recargoInstitucional;
    }
}