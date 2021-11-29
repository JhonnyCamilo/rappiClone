package com.ubosque.deliveryservices;

import org.geotools.geometry.jts.JTS;
import org.geotools.referencing.GeodeticCalculator;
import org.geotools.referencing.crs.DefaultGeographicCRS;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;


public class DistanceGeographicTest {

    @Test
    public void measureDistance() throws Exception {

        Coordinate start = new Coordinate(-74.259898, 4.723905);
        Coordinate end = new Coordinate(-74.255038, 4.722012);

        GeodeticCalculator gc = new GeodeticCalculator(DefaultGeographicCRS.WGS84);
        gc.setStartingPosition(JTS.toDirectPosition(start, DefaultGeographicCRS.WGS84));
        gc.setDestinationPosition(JTS.toDirectPosition(end, DefaultGeographicCRS.WGS84));

        double distance = gc.getOrthodromicDistance();

        int totalmeters = (int) distance;
        int km = totalmeters / 1000;
        int meters = totalmeters - (km * 1000);
        float remaining_cm = (float) (distance - totalmeters) * 10000;
        remaining_cm = Math.round(remaining_cm);
        float cm = remaining_cm / 100;

        System.out.println("Distance = " + km + "km " + meters + "m " + cm + "cm");
    }
}
