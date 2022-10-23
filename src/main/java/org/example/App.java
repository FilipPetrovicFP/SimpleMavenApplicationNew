package org.example;

import org.json.JSONArray;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // instanciranje objekata
        Point p = new Point();
        Figure f = new Figure();
        // koriscenje udaljene biblioteke kojoj maven ima pristup
        JSONArray array = new JSONArray();

        Point p2 = p;
        Figure f2 = f;

        Point p3 = p;
        Figure f3 = f;

        Point p4 = p;
        Figure f4 = f;

        System.out.println("Simple Maven app");
    }
}
