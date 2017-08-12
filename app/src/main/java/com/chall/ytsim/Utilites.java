package com.chall.ytsim;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chall on 12.08.2017.
 */

public class Utilites {

    List<BaseTech> comps;

    public Utilites()
    {
        setComps();
    }

    void setComps()
    {
        comps = new ArrayList<BaseTech>();
        comps.add(new BaseTech("NextFuture",70,1));
    }

    BaseTech getComps(int index)
    {
        return comps.get(index);
    }
}
