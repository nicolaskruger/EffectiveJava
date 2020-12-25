public class TLC {
    static int sf;
    int nf;
    static class SMC{
        static int ssf = sf+TLC.sf;
        int snf = sf +TLC.sf;
    }
    class  NMC{
        int nnf1 = sf +nf;
        int nnf2 = TLC.sf + TLC.this.nf;
    }
    void  nm(){
        class NLC{
            int m(int p){return sf+nf+p;}
        }
    }
}
