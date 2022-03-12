package olivermakesco.de.fasthopper.mixin;

import net.minecraft.block.entity.HopperBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HopperBlockEntity.class)
public class HopperMixin {
    @Inject(at=@At("HEAD"), method="setTransferCooldown")
    private void cancelTransferCooldown(int transferCooldown, CallbackInfo ci) {
        ci.cancel();
    }
}
