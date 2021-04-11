package noppes.mpm.client.layer;

import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerElytra;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import noppes.mpm.ModelData;
import noppes.mpm.constants.EnumParts;

public class LayerElytraAlt extends LayerElytra {

	public LayerElytraAlt(RenderPlayer renderPlayerIn) {
		super((RenderLivingBase)renderPlayerIn);
	}

    public void doRenderLayer(EntityLivingBase entityLiving, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale){
	    if (entityLiving instanceof EntityPlayer) {
	        ModelData data = ModelData.get((EntityPlayer)entityLiving);
	        if (data.getPartData(EnumParts.WINGS) != null && data.wingMode == 1)
	          return;
	      }
		super.doRenderLayer(entityLiving, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
    }
}
