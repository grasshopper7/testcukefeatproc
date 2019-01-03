package progdata;

import java.util.ArrayList;
import java.util.List;

import retriever.program.ProgramDataRetriever;

public class ProgramArgumentsDataRetriever {

	public List<String> getChangedTableData(String[] args) {
		
		List<String> data = new ArrayList<>();		
		ProcessText pt = new ProcessText(args[0], args[1]);
		
		data.add(ProgramDataRetriever.wrapRowDelimiter(pt.wrapText("Prog"), pt.wrapText("Compiler")));
		data.add(ProgramDataRetriever.wrapRowDelimiter(pt.wrapText("Object"), pt.wrapText("Loader")));
		return data;
	}
	
	private static class ProcessText{
		private String prefix;
		private String suffix;
		
		public ProcessText(String prefix, String suffix) {
			this.prefix = prefix;
			this.suffix = suffix;
		}

		public String wrapText(String text) {
			return prefix + text + suffix;
		}
	}
	
}
