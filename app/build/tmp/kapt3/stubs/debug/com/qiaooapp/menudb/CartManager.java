package com.qiaooapp.menudb;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/qiaooapp/menudb/CartManager;", "", "()V", "cartItems", "", "Lcom/qiaooapp/menudb/CartItem;", "getCartItems", "()Ljava/util/List;", "addToCart", "", "item", "Lcom/qiaooapp/menudb/MenuItem;", "quantity", "", "clearCart", "getTotalPrice", "", "removeFromCart", "app_debug"})
public final class CartManager {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.qiaooapp.menudb.CartItem> cartItems = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.qiaooapp.menudb.CartManager INSTANCE = null;
    
    private CartManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.qiaooapp.menudb.CartItem> getCartItems() {
        return null;
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull()
    com.qiaooapp.menudb.MenuItem item, int quantity) {
    }
    
    public final void clearCart() {
    }
    
    public final void removeFromCart(@org.jetbrains.annotations.NotNull()
    com.qiaooapp.menudb.MenuItem item) {
    }
    
    public final double getTotalPrice() {
        return 0.0;
    }
}