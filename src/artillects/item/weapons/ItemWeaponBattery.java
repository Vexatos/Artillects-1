package artillects.item.weapons;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

import artillects.Artillects;
import artillects.item.ItemBase;

public class ItemWeaponBattery extends ItemBase
{

	private int clipSize;

	public ItemWeaponBattery(String name, int clipsize)
	{
		super(name);
		setTextureName(Artillects.PREFIX + name);
		setMaxStackSize(1);

		this.clipSize = clipsize;
	}

	@Override
	public void onCreated(ItemStack itemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (itemStack.stackTagCompound == null)
		{
			itemStack.setTagCompound(new NBTTagCompound());
		}

		itemStack.getTagCompound().setInteger("clipsize", clipSize);
		itemStack.getTagCompound().setInteger("currentStored", 20);
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if (itemStack.stackTagCompound == null)
		{
			itemStack.setTagCompound(new NBTTagCompound());
		}

		par3List.add("Press \247lSHIFT\247r\u00a77 for detail");
		if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			par3List.add("");
			par3List.add("\u00a7bClip Size\u00a77: " + itemStack.getTagCompound().getInteger("clipsize"));
			par3List.add("\u00a7bCharge Stored\u00a77: " + itemStack.getTagCompound().getInteger("currentStored"));
		}
	}

	public void drain(ItemStack itemStack)
	{
		if (itemStack.stackTagCompound == null)
		{
			itemStack.setTagCompound(new NBTTagCompound());
		}

		int storedNow = itemStack.getTagCompound().getInteger("currentStored");

		itemStack.getTagCompound().setInteger("currentStored", storedNow - 1);
	}

	public boolean isEmpty(ItemStack itemStack)
	{
		if (itemStack.stackTagCompound == null)
		{
			itemStack.setTagCompound(new NBTTagCompound());
		}
		if (itemStack.getTagCompound().getInteger("currentStored") > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
