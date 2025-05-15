package com.qiaooapp.menudb;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0005J*\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00070\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/qiaooapp/menudb/ApiService;", "", "getMenus", "", "Lcom/qiaooapp/menudb/MenuItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRates", "", "", "", "postCheckout", "Lretrofit2/Response;", "data", "Lcom/qiaooapp/menudb/CheckoutRequest;", "(Lcom/qiaooapp/menudb/CheckoutRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "get_menu.php")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMenus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.qiaooapp.menudb.MenuItem>> $completion);
    
    @retrofit2.http.GET(value = "get_rateUSD.php")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.Double>> $completion);
    
    @retrofit2.http.POST(value = "post_checkout.php")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCheckout(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.qiaooapp.menudb.CheckoutRequest data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.Map<java.lang.String, java.lang.Object>>> $completion);
}