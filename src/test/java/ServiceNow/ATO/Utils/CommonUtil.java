package ServiceNow.ATO.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class CommonUtil {
	
	

	/**
	 * This method will convert the cucumber datatable into java hashmap.
	 * The first row in the datatable is considered as the header of the table.
	 * @param dataTable
	 * @return Map
	 */
	public static Map<String, String> getMapFromDataTable(DataTable dataTable) {
		Map<String, String> dataMap = new HashMap<String, String>();
		if(dataTable != null) {
			List<List<String>> rawData = dataTable.asLists();
			List<String> headersList = rawData.get(0);
			List<String> dataList = null;
			for(int i=1; i<rawData.size(); i++) {
				dataList = rawData.get(i);
				for(int j=0; j<headersList.size(); j++) {
					dataMap.put(headersList.get(j), dataList.get(j));
				}
			}
		}
		return dataMap;
	}
	
	public static void waitBrowser(int ms) {
		try {
			Thread.sleep(ms);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	
	
}
