package patterns.structural.adaptor;
import utils.structural.adaptor.Tv_Cd_Connector;

public class CdAdaptor implements Tv_Cd_Connector {
        private Cd adapter;
        public CdAdaptor(Cd c){
            this.adapter = c;
        }
        public void info(){
            adapter.info();
        }
    }
