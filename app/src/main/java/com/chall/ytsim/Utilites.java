package com.chall.ytsim;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chall on 12.08.2017.
 */

public class Utilites {
    List<String[]> Comps;
    public Utilites()
    {
        Comps = new ArrayList<String[]>(); setComps();
    }
    void setComps()
    {
        Comps.add(new String[]{"NextFuture","60","1"});
    }
    String[] getComps(int index)
    {
        return Comps.get(index);
    }
}
