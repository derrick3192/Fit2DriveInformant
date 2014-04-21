package resource;

public class ResourceLoaderTestResources {
	private ResourceLoaderTestResources(){};
	
	public static enum ListFiles {
		TESTPICTURE,
		NULL
	}
	
	private static ResourceLoaderTestResources rl = new ResourceLoaderTestResources();
	
	
	public static String getImagePath(ListFiles file) {
		
		String path;
		
		switch(file) {
		case NULL:
			return null;
		case TESTPICTURE:
			path = "img/pinguin.jpg";
			break;
		default:
			return null;
		
		}
		return rl.getClass().getResource(path).getPath();
		
		//return rl.getClass().getResource("img"+"/"+image).getPath();
	}
	
}
