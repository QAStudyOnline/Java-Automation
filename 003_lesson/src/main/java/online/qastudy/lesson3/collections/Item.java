package online.qastudy.lesson3.collections;

import com.sun.istack.internal.NotNull;

import java.math.BigDecimal;

public class Item {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(@NotNull BigDecimal price) {
        this.price = price;
    }

    public Item() {
    }

    public Item(@NotNull String name, @NotNull BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (!name.equals(item.name)) return false;
        return price.equals(item.price);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price.hashCode();
        return result;
    }
}
