package link.e4mc.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class AgnosImpl {
    public static boolean isClient() {
        return FMLLoader.getDist().equals(Dist.CLIENT);
    }

    public static Path configDir() {
        return FMLPaths.CONFIGDIR.get();
    }
}
