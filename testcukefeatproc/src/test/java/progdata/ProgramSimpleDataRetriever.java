package progdata;

import java.util.ArrayList;
import java.util.List;

import retriever.program.ProgramDataRetriever;

public class ProgramSimpleDataRetriever {

	public List<String> getTableData(String[] args) {
		
		List<String> data = new ArrayList<>();
		
		data.add(ProgramDataRetriever.wrapRowDelimiter("Prog", "Compiler"));
		data.add(ProgramDataRetriever.wrapRowDelimiter("Object", "Loader"));
		return data;
	}
}
