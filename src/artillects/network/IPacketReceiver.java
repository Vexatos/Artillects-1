package artillects.network;

import net.minecraft.entity.player.EntityPlayer;

import com.google.common.io.ByteArrayDataInput;

/** @author Calclavia, darkguardsman */
public interface IPacketReceiver
{
	/**
	 * @param data - data encoded into the packet
	 * @param player - player that sent or is receiving the packet
	 */
	public void onReceivePacket(ByteArrayDataInput data, EntityPlayer player);
}
