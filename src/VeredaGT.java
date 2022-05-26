public class VeredaGT implements Vehicle{
    private final String matricula;
    private final float maxEnergy;
    private float energy;
    private int movementCount = 0;
    private float energyDelta;

    public VeredaGT(String matricula, float maxEnergy, float energy, float energyDelta) {
        this.matricula = matricula;
        this.maxEnergy = maxEnergy;
        this.energy = energy;
        this.energyDelta = energyDelta;
    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        System.out.println("Cargando con carga ultrarápida...");
        energy = maxEnergy;
        System.out.println("El vehículo está completamente cargado");
    }

    @Override
    public void move() {
        float comprobacion = energy - energyDelta;
        if (comprobacion >= 0) {
            if (energy > 0) {
                movementCount++;
                energy -= energyDelta;
                System.out.println("El vehículo se ha movido...");
            }
        } else if (energy == 0){
            System.out.println("El vehículo no tiene batería, debes cargarlo para moverte");
        } else {
            System.out.println("El vehículo tiene un nivel de batería de " + energy + " , no te puedes mover con sólo con esa energía");
        }

    }

    @Override
    public String status() {
        return "El vehículo " + matricula + " tiene un nivel de carga de: " + energy + " y se ha movido " + movementCount +
                " veces.";
    }
}
