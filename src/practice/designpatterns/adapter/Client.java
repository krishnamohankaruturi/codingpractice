package practice.designpatterns.adapter;

public class Client {
    public static void main(String[] args) {
        BarrelCharger barrelCharger = new BarrelCharger();
        TypeCcharger adapter = new ChargerAdapter(barrelCharger);
        adapter.chargeWithTypeC();

    }
}
