package web.hotchop.models.interfaces;

public interface Combat {
    int attack();
    int damage();
    void getHit(int damage);
    void die();
}
