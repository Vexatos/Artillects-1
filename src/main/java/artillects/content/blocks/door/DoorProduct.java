package artillects.content.blocks.door;

import org.w3c.dom.Document;

import resonant.lib.content.ContentRegistry;
import artillects.core.creation.ContentFactory;
import artillects.core.creation.content.Product;

public class DoorProduct extends Product<DoorProduct>
{
    @Override
    public Product<DoorProduct> loadData(Document doc)
    {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public DoorProduct create(ContentRegistry creator)
    {        
        return this;
    }

}