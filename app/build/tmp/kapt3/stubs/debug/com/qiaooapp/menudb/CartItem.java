package com.qiaooapp.menudb;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/qiaooapp/menudb/CartItem;", "", "menuId", "", "menuName", "menuImage", "menuPrice", "", "quantity", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DI)V", "getMenuId", "()Ljava/lang/String;", "getMenuImage", "getMenuName", "getMenuPrice", "()D", "getQuantity", "()I", "setQuantity", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CartItem {
    @com.google.gson.annotations.SerializedName(value = "menu_id")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String menuId = null;
    @com.google.gson.annotations.SerializedName(value = "menu_name")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String menuName = null;
    @com.google.gson.annotations.SerializedName(value = "menu_image")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String menuImage = null;
    @com.google.gson.annotations.SerializedName(value = "menu_price")
    private final double menuPrice = 0.0;
    @com.google.gson.annotations.SerializedName(value = "quantity")
    private int quantity;
    
    public CartItem(@org.jetbrains.annotations.NotNull()
    java.lang.String menuId, @org.jetbrains.annotations.NotNull()
    java.lang.String menuName, @org.jetbrains.annotations.NotNull()
    java.lang.String menuImage, double menuPrice, int quantity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMenuId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMenuName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMenuImage() {
        return null;
    }
    
    public final double getMenuPrice() {
        return 0.0;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.qiaooapp.menudb.CartItem copy(@org.jetbrains.annotations.NotNull()
    java.lang.String menuId, @org.jetbrains.annotations.NotNull()
    java.lang.String menuName, @org.jetbrains.annotations.NotNull()
    java.lang.String menuImage, double menuPrice, int quantity) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}