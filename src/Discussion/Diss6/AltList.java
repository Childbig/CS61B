package Discussion.Diss6;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/11/2
 *  Last updated:  2018/11/2
 *  Compilation:   javac AltList.java
 *  Description: 
 *
 ******************************************************************************/


public class AltList<X, Y> {
    private X item;
    private AltList<Y, X> next;

    AltList(X item, AltList<Y, X> next) {
        this.item = item;
        this.next = next;
    }

    public AltList<Y, X> pairsSwapped() {
        AltList<Y, X> ret = new AltList<Y, X>(next.item, new AltList<X,
                Y>(item, null));
        if (next.next != null) {
            ret.next.next = next.next.pairsSwapped();
        }
        return ret;
    }

}
