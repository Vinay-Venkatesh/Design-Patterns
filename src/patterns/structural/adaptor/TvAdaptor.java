package patterns.structural.adaptor;
import utils.structural.adaptor.Tv_Cd_Connector;

public class TvAdaptor implements Tv_Cd_Connector {
        private Tv adapter;
        public TvAdaptor(Tv c){
            this.adapter = c;
        }
        public void info(){
            adapter.info();
        }
    }
