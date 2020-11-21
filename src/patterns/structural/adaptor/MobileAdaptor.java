package patterns.structural.adaptor;

import utils.structural.adaptor.Mobile_Cpu_Connector;

public class MobileAdaptor implements Mobile_Cpu_Connector {
    private Mobile adapter;
    public MobileAdaptor(Mobile m){
        this.adapter = m;
    }
    public void info(){
        adapter.info();
    }
}
