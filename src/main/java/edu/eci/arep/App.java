package edu.eci.arep;

import static spark.Spark.port;
import static spark.Spark.get;

import edu.eci.arep.Math.Calculator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        port(getPort());
        get("/acos", Calculator::acos);
        get("/asin", Calculator::asin);
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set
    }
}
