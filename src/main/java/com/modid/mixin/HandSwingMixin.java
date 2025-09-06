@Mixin(HeldItemRenderer.class)
public class HandSwingMixin {
    @org.spongepowered.asm.mixin.injection.Inject(method = "<init>", at = @At("TAIL"))
    private void onInit(org.spongepowered.asm.mixin.injection.callback.CallbackInfo ci) {
        System.out.println("HandSwingMixin loaded!");
    }
}