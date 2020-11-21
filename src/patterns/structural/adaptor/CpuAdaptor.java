package patterns.structural.adaptor;

import utils.structural.adaptor.Mobile_Cpu_Connector;

public class CpuAdaptor implements Mobile_Cpu_Connector {
        private Cpu adapter;
        public CpuAdaptor(Cpu c){
            this.adapter = c;
        }
        public void info(){
            adapter.info();
        }
    }
