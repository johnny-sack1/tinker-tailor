package com.codecool.tinkerTailor;

import java.util.ArrayList;
import java.util.List;

public class TinkerTailor {
    private int n;
    private int k;

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }

    private List<Integer> createCircle() {
        List<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }
        return circle;
    }

    private int getPlayer(List<Integer> circle, int startingPlayerIndex) {
        int current = 0;
        for (int i = startingPlayerIndex; i < k + startingPlayerIndex; i++) {
            if (i >= circle.size()) {
                current = circle.get(i % circle.size());
                System.out.println(current);
            }
            else {
                current = circle.get(i);
                System.out.println(current);
            }
        }
        return current;
    }

    public List<Integer> start() {
        List<Integer> circle = createCircle();
        List<Integer> eliminatedPlayers = new ArrayList<>();
        int startingPlayerIndex = 0;
        for (int i = 0; i < n; i++) {
            int eliminatedPlayer = getPlayer(circle, startingPlayerIndex);
            startingPlayerIndex = circle.indexOf(eliminatedPlayer);
            circle.remove(new Integer(eliminatedPlayer));
            eliminatedPlayers.add(eliminatedPlayer);
        }
        return eliminatedPlayers;
    }
}
