package tugas;

public class Main {
    public static void main(String[] args) {
        Novel novel1 = new Novel();
        novel1.setDetail("Bumi Manusia", "Pramoedya Ananta Toer", "Hasta Mitra", 1980);
        novel1.bacaRingkasan();
        novel1.cetakInformasi();

        Parfum parfum1 = new Parfum();
        parfum1.setDetail("HEURA", "Noir Blanc", 80000);
        parfum1.semprot();
        parfum1.cetakInformasi();

        Sepatu sepatu1 = new Sepatu();
        sepatu1.setSepatu("Bata", 150000);
        sepatu1.bersihkan();
        sepatu1.cetakInformasi();

        SepatuFutsal futsal1 = new SepatuFutsal();
        futsal1.setDetailFutsal("Specs", 450000, "Karet Non-Marking", "Sintetis PU");
        futsal1.bersihkan(); // Memanggil method warisan dari class Sepatu
        futsal1.pakaiMainFutsal();
        futsal1.cetakInformasi();

        SepatuSneakers sneakers1 = new SepatuSneakers();
        sneakers1.setDetailSneakers("Kanky", 330000, "Rubber Vulkanisir", "Canvas 12oz");
        sneakers1.bersihkan(); // Memanggil method warisan dari class Sepatu
        sneakers1.pakaiJalan();
        sneakers1.cetakInformasi();
    }
}
