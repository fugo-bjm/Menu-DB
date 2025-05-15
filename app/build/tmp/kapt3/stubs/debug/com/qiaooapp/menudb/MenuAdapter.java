package com.qiaooapp.menudb;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ \u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/qiaooapp/menudb/MenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/qiaooapp/menudb/MenuAdapter$MenuViewHolder;", "menuList", "", "Lcom/qiaooapp/menudb/MenuItem;", "basesUrl", "", "rateIdrUsd", "", "(Ljava/util/List;Ljava/lang/String;D)V", "getBasesUrl", "()Ljava/lang/String;", "formatShortCurrency", "amount", "locale", "Ljava/util/Locale;", "prefix", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MenuViewHolder", "app_debug"})
public final class MenuAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.qiaooapp.menudb.MenuAdapter.MenuViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.qiaooapp.menudb.MenuItem> menuList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String basesUrl = null;
    private final double rateIdrUsd = 0.0;
    
    public MenuAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.qiaooapp.menudb.MenuItem> menuList, @org.jetbrains.annotations.NotNull()
    java.lang.String basesUrl, double rateIdrUsd) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBasesUrl() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.qiaooapp.menudb.MenuAdapter.MenuViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.qiaooapp.menudb.MenuAdapter.MenuViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final java.lang.String formatShortCurrency(double amount, java.util.Locale locale, java.lang.String prefix) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/qiaooapp/menudb/MenuAdapter$MenuViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "btnMinus", "Landroid/widget/Button;", "getBtnMinus", "()Landroid/widget/Button;", "btnPlus", "getBtnPlus", "imageMenu", "Landroid/widget/ImageView;", "getImageMenu", "()Landroid/widget/ImageView;", "textMenuName", "Landroid/widget/TextView;", "getTextMenuName", "()Landroid/widget/TextView;", "textMenuPrice", "getTextMenuPrice", "textMenuUsd", "getTextMenuUsd", "tvQuantity", "getTvQuantity", "app_debug"})
    public static final class MenuViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imageMenu = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textMenuName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textMenuPrice = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textMenuUsd = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button btnPlus = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button btnMinus = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvQuantity = null;
        
        public MenuViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImageMenu() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextMenuName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextMenuPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextMenuUsd() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getBtnPlus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getBtnMinus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvQuantity() {
            return null;
        }
    }
}