package net.nerdorg.minehop.util;

import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.Entity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.nerdorg.minehop.Minehop;
import net.nerdorg.minehop.data.DataManager;
import net.nerdorg.minehop.entity.custom.EndEntity;
import net.nerdorg.minehop.entity.custom.ResetEntity;
import net.nerdorg.minehop.entity.custom.StartEntity;
import net.nerdorg.minehop.entity.custom.Zone;
import com.mojang.datafixers.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class ZoneUtil {
    public static String getCurrentMapName(Entity target_entity) {
        for (Pair<String, String> str : DataManager.currentMapPlayers) {
            if (str.getFirst().equals(target_entity.getUuidAsString())) {
                return str.getSecond();
            }
        }
        return null;
    }

    public static DataManager.MapData getCurrentMap(Entity target_entity) {
        return DataManager.getMap(getCurrentMapName(target_entity));
    }
}
