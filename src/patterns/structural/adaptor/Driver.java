package patterns.structural.adaptor;

import utils.structural.adaptor.Mobile_Cpu_Connector;
import utils.structural.adaptor.Tv_Cd_Connector;

public class Driver {
    public static void main(String[] args){
        Mobile_Cpu_Connector[] list1 = {
                new CpuAdaptor(new Cpu()),
                new MobileAdaptor(new Mobile())
        };
        for(Mobile_Cpu_Connector connector : list1){
            connector.info();
        }

        Tv_Cd_Connector[] list2 = {
                new TvAdaptor(new Tv()),
                new CdAdaptor(new Cd())
        };
        for(Tv_Cd_Connector connector : list2){
            connector.info();
        }
    }
}
