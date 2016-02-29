package us.myles.ViaVersion.packets;

public enum PacketType {
    /* Handshake serverbound */
    HANDSHAKE(State.HANDSHAKE, Direction.INCOMING, 0x00),
    /* Login serverbound */
    LOGIN_START(State.LOGIN, Direction.INCOMING, 0x00),
    LOGIN_ENCRYPTION_RESPONSE(State.LOGIN, Direction.INCOMING, 0x01),
    /* Login clientbound */
    LOGIN_DISCONNECT(State.LOGIN, Direction.OUTGOING, 0x00),
    LOGIN_ENCRYPTION_REQUEST(State.LOGIN, Direction.OUTGOING, 0x01),
    LOGIN_SUCCESS(State.LOGIN, Direction.OUTGOING, 0x02),
    LOGIN_SETCOMPRESSION(State.LOGIN, Direction.OUTGOING, 0x03),
    /* Status serverbound */
    STATUS_REQUEST(State.STATUS, Direction.INCOMING, 0x00),
    STATUS_PING(State.STATUS, Direction.INCOMING, 0x01),
    /* Status clientbound */
    STATUS_RESPONSE(State.STATUS, Direction.OUTGOING, 0x00),
    STATUS_PONG(State.STATUS, Direction.OUTGOING, 0x01),
    /* Play serverbound */
    PLAY_TP_CONFIRM(State.PLAY, Direction.INCOMING, -1, 0x00),
    PLAY_TAB_COMPLETE_REQUEST(State.PLAY, Direction.INCOMING, 0x14, 0x01),
    PLAY_CLICHAT_MESSAGE_CLIENT(State.PLAY, Direction.INCOMING, 0x01, 0x02),
    PLAY_CLIENT_STATUS(State.PLAY, Direction.INCOMING, 0x16, 0x03),
    PLAY_CLIENT_SETTINGS(State.PLAY, Direction.INCOMING, 0x15, 0x04),
    PLAY_CONFIRM_TRANS(State.PLAY, Direction.INCOMING, 0x0F, 0x05),
    PLAY_ENCHANT_ITEM(State.PLAY, Direction.INCOMING, 0x11, 0x06),
    PLAY_CLICK_WINDOW(State.PLAY, Direction.INCOMING, 0x0E, 0x07),
    PLAY_CLOSE_WINDOW_REQUEST(State.PLAY, Direction.INCOMING, 0x0D, 0x08),
    PLAY_PLUGIN_MESSAGE_REQUEST(State.PLAY, Direction.INCOMING, 0x17, 0x09),
    PLAY_USE_ENTITY(State.PLAY, Direction.INCOMING, 0x02, 0x0A),
    PLAY_KEEP_ALIVE_REQUEST(State.PLAY, Direction.INCOMING, 0x00, 0x0B),
    PLAY_PLAYER_POSITION_REQUEST(State.PLAY, Direction.INCOMING, 0x04, 0x0C),
    PLAY_PLAYER_POSITION_LOOK_REQUEST(State.PLAY, Direction.INCOMING, 0x06, 0x0D),
    PLAY_PLAYER_LOOK_REQUEST(State.PLAY, Direction.INCOMING, 0x05, 0x0E),
    PLAY_PLAYER(State.PLAY, Direction.INCOMING, 0x03, 0x0F),
    PLAY_VEHICLE_MOVE_REQUEST(State.PLAY, Direction.INCOMING, -1, 0x10),
    PLAY_STEER_BOAT(State.PLAY, Direction.INCOMING, -1, 0x11),
    PLAY_PLAYER_ABILITIES_REQUEST(State.PLAY, Direction.INCOMING, 0x13, 0x12),
    PLAY_PLAYER_DIGGING(State.PLAY, Direction.INCOMING, 0x07, 0x13),
    PLAY_ENTITY_ACTION(State.PLAY, Direction.INCOMING, 0x0B, 0x14),
    PLAY_STEER_VEHICLE(State.PLAY, Direction.INCOMING, 0x0C, 0x15),
    PLAY_RESOURCE_PACK_STATUS(State.PLAY, Direction.INCOMING, 0x19, 0x16),
    PLAY_HELD_ITEM_CHANGE_REQUEST(State.PLAY, Direction.INCOMING, 0x09, 0x17),
    PLAY_CREATIVE_INVENTORY_ACTION(State.PLAY, Direction.INCOMING, 0x10, 0x18),
    PLAY_UPDATE_SIGN_REQUEST(State.PLAY, Direction.INCOMING, 0x12, 0x19),
    PLAY_ANIMATION_REQUEST(State.PLAY, Direction.INCOMING, 0x0A, 0x1A),
    PLAY_SPECTATE(State.PLAY, Direction.INCOMING, 0x18, 0x1B),
    PLAY_PLAYER_BLOCK_PLACEMENT(State.PLAY, Direction.INCOMING, 0x08, 0x1C),
    PLAY_USE_ITEM(State.PLAY, Direction.INCOMING, -1, 0x1D),
    /* Play clientbound */
    PLAY_SPAWN_OBJECT(State.PLAY, Direction.OUTGOING, 0x0E, 0x00),
    PLAY_SPAWN_XP_ORB(State.PLAY, Direction.OUTGOING, 0x11, 0x01),
    PLAY_SPAWN_GLOBAL_ENTITY(State.PLAY, Direction.OUTGOING, 0x2C, 0x02),
    PLAY_SPAWN_MOB(State.PLAY, Direction.OUTGOING, 0x0F, 0x03),
    PLAY_SPAWN_PAINTING(State.PLAY, Direction.OUTGOING, 0x10, 0x04),
    PLAY_SPAWN_PLAYER(State.PLAY, Direction.OUTGOING, 0x0C, 0x05),
    PLAY_ANIMATION(State.PLAY, Direction.OUTGOING, 0x0B, 0x06),
    PLAY_STATS(State.PLAY, Direction.OUTGOING, 0x37, 0x07),
    PLAY_BLOCK_BREAK_ANIMATION(State.PLAY, Direction.OUTGOING, 0x25, 0x08),
    PLAY_UPDATE_BLOCK_ENTITY(State.PLAY, Direction.OUTGOING, 0x35, 0x09),
    PLAY_BLOCK_ACTION(State.PLAY, Direction.OUTGOING, 0x24, 0x0A),
    PLAY_BLOCK_CHANGE(State.PLAY, Direction.OUTGOING, 0x23, 0x0B),
    PLAY_BOSS_BAR(State.PLAY, Direction.OUTGOING, -1, 0x0C),
    PLAY_SERVER_DIFFICULTY(State.PLAY, Direction.OUTGOING, 0x41, 0x0D),
    PLAY_TAB_COMPLETE(State.PLAY, Direction.OUTGOING, 0x3A, 0x0E),
    PLAY_CHAT_MESSAGE(State.PLAY, Direction.OUTGOING, 0x02, 0x0F),
    PLAY_MULTI_BLOCK_CHANGE(State.PLAY, Direction.OUTGOING, 0x22, 0x10),
    PLAY_CONFIRM_TRANSACTION(State.PLAY, Direction.OUTGOING, 0x32, 0x11),
    PLAY_CLOSE_WINDOW(State.PLAY, Direction.OUTGOING, 0x2E, 0x12),
    PLAY_OPEN_WINDOW(State.PLAY, Direction.OUTGOING, 0x2D, 0x13),
    PLAY_WINDOW_ITEMS(State.PLAY, Direction.OUTGOING, 0x30, 0x14),
    PLAY_WINDOW_PROPERTY(State.PLAY, Direction.OUTGOING, 0x31, 0x15),
    PLAY_SET_SLOT(State.PLAY, Direction.OUTGOING, 0x2F, 0x16),
    PLAY_SET_COOLDOWN(State.PLAY, Direction.OUTGOING, -1, 0x17),
    PLAY_PLUGIN_MESSAGE(State.PLAY, Direction.OUTGOING, 0x3F, 0x18),
    PLAY_NAMED_SOUND_EFFECT(State.PLAY, Direction.OUTGOING, 0x29, 0x19),
    PLAY_DISCONNECT(State.PLAY, Direction.OUTGOING, 0x40, 0x1A),
    PLAY_ENTITY_STATUS(State.PLAY, Direction.OUTGOING, 0x1A, 0x1B),
    PLAY_EXPLOSION(State.PLAY, Direction.OUTGOING, 0x27, 0x1C),
    PLAY_UNLOAD_CHUNK(State.PLAY, Direction.OUTGOING, -1, 0x1D),
    PLAY_CHANGE_GAME_STATE(State.PLAY, Direction.OUTGOING, 0x2B, 0x1E),
    PLAY_KEEP_ALIVE(State.PLAY, Direction.OUTGOING, 0x00, 0x1F),
    PLAY_CHUNK_DATA(State.PLAY, Direction.OUTGOING, 0x21, 0x20),
    PLAY_EFFECT(State.PLAY, Direction.OUTGOING, 0x28, 0x21),
    PLAY_PARTICLE(State.PLAY, Direction.OUTGOING, 0x2A, 0x22),
    PLAY_JOIN_GAME(State.PLAY, Direction.OUTGOING, 0x01, 0x23),
    PLAY_MAP(State.PLAY, Direction.OUTGOING, 0x34, 0x24),
    PLAY_ENTITY_RELATIVE_MOVE(State.PLAY, Direction.OUTGOING, 0x15, 0x25),
    PLAY_ENTITY_LOOK_MOVE(State.PLAY, Direction.OUTGOING, 0x17, 0x26),
    PLAY_ENTITY_LOOK(State.PLAY, Direction.OUTGOING, 0x16, 0x27),
    PLAY_ENTITY(State.PLAY, Direction.OUTGOING, 0x14, 0x28),
    PLAY_VEHICLE_MOVE(State.PLAY, Direction.OUTGOING, -1, 0x29),
    PLAY_OPEN_SIGN_EDITOR(State.PLAY, Direction.OUTGOING, 0x36, 0x2A),
    PLAY_PLAYER_ABILITIES(State.PLAY, Direction.OUTGOING, 0x39, 0x2B),
    PLAY_COMBAT_EVENT(State.PLAY, Direction.OUTGOING, 0x42, 0x2C),
    PLAY_PLAYER_LIST_ITEM(State.PLAY, Direction.OUTGOING, 0x38, 0x2D),
    PLAY_PLAYER_POSITION_LOOK(State.PLAY, Direction.OUTGOING, 0x08, 0x2E),
    PLAY_USE_BED(State.PLAY, Direction.OUTGOING, 0x2F, 0x2F),
    PLAY_DESTROY_ENTITIES(State.PLAY, Direction.OUTGOING, 0x13, 0x30),
    PLAY_REMOVE_ENTITY_EFFECT(State.PLAY, Direction.OUTGOING, 0x1E, 0x31),
    PLAY_RESOURCE_PACK_SEND(State.PLAY, Direction.OUTGOING, 0x48, 0x32),
    PLAY_RESPAWN(State.PLAY, Direction.OUTGOING, 0x07, 0x33),
    PLAY_ENTITY_HEAD_LOOK(State.PLAY, Direction.OUTGOING, 0x19, 0x34),
    PLAY_WORLD_BORDER(State.PLAY, Direction.OUTGOING, 0x44, 0x35),
    PLAY_CAMERA(State.PLAY, Direction.OUTGOING, 0x43, 0x36),
    PLAY_HELD_ITEM_CHANGE(State.PLAY, Direction.OUTGOING, 0x09, 0x37),
    PLAY_DISPLAY_SCOREBOARD(State.PLAY, Direction.OUTGOING, 0x3D, 0x38),
    PLAY_ENTITY_METADATA(State.PLAY, Direction.OUTGOING, 0x1C, 0x39),
    PLAY_ATTACH_ENTITY(State.PLAY, Direction.OUTGOING, 0x1B, 0x3A),
    PLAY_ENTITY_VELOCITY(State.PLAY, Direction.OUTGOING, 0x12, 0x3B),
    PLAY_ENTITY_EQUIPMENT(State.PLAY, Direction.OUTGOING, 0x04, 0x3C),
    PLAY_SET_XP(State.PLAY, Direction.OUTGOING, 0x1F, 0x3D),
    PLAY_UPDATE_HEALTH(State.PLAY, Direction.OUTGOING, 0x06, 0x3E),
    PLAY_SCOREBOARD_OBJ(State.PLAY, Direction.OUTGOING, 0x3B, 0x3F),
    PLAY_SET_PASSENGERS(State.PLAY, Direction.OUTGOING, -1, 0x40),
    PLAY_TEAM(State.PLAY, Direction.OUTGOING, 0x3E, 0x41),
    PLAY_UPDATE_SCORE(State.PLAY, Direction.OUTGOING, 0x3C, 0x42),
    PLAY_SPAWN_POSITION(State.PLAY, Direction.OUTGOING, 0x05, 0x43),
    PLAY_TIME_UPDATE(State.PLAY, Direction.OUTGOING, 0x03, 0x44),
    PLAY_TITLE(State.PLAY, Direction.OUTGOING, 0x45, 0x45),
    PLAY_UPDATE_SIGN(State.PLAY, Direction.OUTGOING, 0x33, 0x46),
    PLAY_SOUND_EFFECT(State.PLAY, Direction.OUTGOING, -1, 0x47),
    PLAY_PLAYER_LIST_HEADER_FOOTER(State.PLAY, Direction.OUTGOING, 0x47, 0x48),
    PLAY_COLLECT_ITEM(State.PLAY, Direction.OUTGOING, 0x0D, 0x49),
    PLAY_ENTITY_TELEPORT(State.PLAY, Direction.OUTGOING, 0x18, 0x4A),
    PLAY_ENTITY_PROPERTIES(State.PLAY, Direction.OUTGOING, 0x20, 0x4B),
    PLAY_ENTITY_EFFECT(State.PLAY, Direction.OUTGOING, 0x1D, 0x4C),

    PLAY_MAP_CHUNK_BULK(State.PLAY, Direction.OUTGOING, 0x26, -1),
    PLAY_SET_COMPRESSION(State.PLAY, Direction.OUTGOING, 0x46, -1),
    PLAY_UPDATE_ENTITY_NBT(State.PLAY, Direction.OUTGOING, 0x49, -1),;

    private State state;
    private Direction direction;
    private int packetID;
    private int newPacketID = -1;

    PacketType(State state, Direction direction, int packetID) {
        this.state = state;
        this.direction = direction;
        this.packetID = packetID;
        this.newPacketID = packetID;
    }

    PacketType(State state, Direction direction, int packetID, int newPacketID) {
        this.state = state;
        this.direction = direction;
        this.packetID = packetID;
        this.newPacketID = newPacketID;
    }

    public State getState() {
        return state;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getPacketID() {
        return packetID;
    }

    public int getNewPacketID() {
        return newPacketID;
    }

    public static PacketType findNewPacket(State state, Direction direction, int id) {
        for (PacketType pt : values()) {
            if (pt.getNewPacketID() == id && id != -1
                    && pt.getState() == state
                    && pt.getDirection() == direction)
                return pt;
        }
        return null;
    }

    public static PacketType findOldPacket(State state, Direction direction, int id) {
        for (PacketType pt : values()) {
            if (pt.getPacketID() == id && id != -1
                    && pt.getState() == state
                    && pt.getDirection() == direction)
                return pt;
        }
        return null;
    }

    public static PacketType getIncomingPacket(State state, int id) {
        return findNewPacket(state, Direction.INCOMING, id);
    }

    public static PacketType getOutgoingPacket(State state, int id) {
        return findOldPacket(state, Direction.OUTGOING, id);
    }
}
