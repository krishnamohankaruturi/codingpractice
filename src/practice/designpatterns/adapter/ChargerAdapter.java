package practice.designpatterns.adapter;

public class ChargerAdapter  implements  TypeCcharger{

    private  final  BarrelCharger barrelCharger;

    public ChargerAdapter(BarrelCharger barrelCharger) {
        this.barrelCharger = barrelCharger;
    }

    @Override
    public void chargeWithTypeC() {
        System.out.println("⚡ Adapter in use: Converting Barrel Plug to Type-C...");
        barrelCharger.chargeWithBarrelPlug();

    }
}
