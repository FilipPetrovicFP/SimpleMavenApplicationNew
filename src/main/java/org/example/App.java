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

        System.out.println("Simple Maven app");
    }
}
