package org.example;

import org.example.figuri.Figuri;
import org.example.figuri.Krug;
import org.example.figuri.Kvadrat;
import org.example.figuri.Romb;

public class Main {
    public static void main(String[] args) {

    Romb romb = new Romb ();
    Krug krug = new Krug ();
    Kvadrat kvadrat = new Kvadrat ();

    krug.displayName();
    romb.displayName();
    kvadrat.displayName();

    }
}