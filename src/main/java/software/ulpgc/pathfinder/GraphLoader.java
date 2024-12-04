package software.ulpgc.pathfinder;

import java.io.IOException;

public interface GraphLoader {
	GraphContainer load() throws IOException;
}
