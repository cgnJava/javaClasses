package com.cognitran.classes.topic5.exception;

public enum CategoryParseType implements Parseable<ProductType>
{
    BY_SHORTCUT {
        @Override
        public ProductType parse(String value)
        {
            for (ProductType type : ProductType.values())
            {
                if (type.getShortcut().equals(value))
                {
                    return type;
                }
            }
            throw new IllegalArgumentException("Nieznana kategoria: " + value);
        }
    }, BY_NAME {
        @Override
        public ProductType parse(String value)
        {
            return ProductType.valueOf(value);
        }
    }, BY_ORDINAL {
        @Override
        public ProductType parse(String value)
        {
            int index = Integer.parseInt(value);
            return ProductType.values()[index];
        }
    };

    @Override
    public abstract ProductType parse(String value) throws IllegalArgumentException;
}
