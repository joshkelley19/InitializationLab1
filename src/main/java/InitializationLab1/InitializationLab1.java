package InitializationLab1;

/**
 * Created by joshuakelley on 9/10/16.
 */

public class InitializationLab1 {
    public static void main(String[] args) {
        BoringThing boringThing1 = new BoringThing();
        BoringThing boringThing2 = new BoringThing();
        BoringThing boringThing3 = new BoringThing();
        BoringThing boringThing4 = new BoringThing();
        BoringThing boringThing5 = new BoringThing();

        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.ColorEnum.RED);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.ColorEnum.BLUE);
        ColorfulThing colorfulThing3 = new ColorfulThing(ColorfulThing.ColorEnum.GREEN);
        ColorfulThing colorfulThing4 = new ColorfulThing(ColorfulThing.ColorEnum.PURPLE);
        ColorfulThing colorfulThing5 = new ColorfulThing(ColorfulThing.ColorEnum.YELLOW);

        System.out.print("Color 1: "+colorfulThing1.getColor()+", Color 2: "+colorfulThing2.getColor()+", Color 3: "+colorfulThing3.getColor()+", Color 4: "+colorfulThing4.getColor()+", Color 5: "+colorfulThing5.getColor());

        //ColorfulThing colorfulThing6 = new ColorfulThing(); causes error



    }
}
