package cap6;

import java.util.Calendar;

class RelogioDoSistema implements Relogio {
	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}
}