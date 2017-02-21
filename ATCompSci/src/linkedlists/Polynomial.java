package linkedlists;

import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial {
	LinkedList<Term> list;

	public Polynomial() {
		list = new LinkedList<Term>();
	}

	public Polynomial(LinkedList<Term> _list) {
		list = _list;
	}

	public LinkedList<Term> sort() {
		ListIterator<Term> listIter = list.listIterator();
		Term x, max = listIter.next();
		int size = list.size();
		LinkedList<Term> newList = new LinkedList<Term>();
		int a = 0;
		while (a < size) {

			while (listIter.hasNext()) {
				x = listIter.next();
				
				if (x.getDegree() > max.getDegree()) {
					max = x;
				}

			}
			newList.add(max);
			listIter = list.listIterator();
			while (listIter.hasNext()) {
				if (max == listIter.next()) {
					listIter.remove();
					break;
				}

			}
			a++;
			listIter = list.listIterator();
			if (listIter.hasNext()) {
				max = listIter.next();
			}
		}

		return newList;

	}

	public void addTerm(int coeff, int degree) {
		list.add(new Term(coeff, degree));
	}

	public Polynomial add(Polynomial poly) {
		LinkedList<Term> addTerms = new LinkedList<Term>();
		ListIterator<Term> listIter = list.listIterator();
		ListIterator<Term> listnew = addTerms.listIterator();
		ListIterator<Term> _listIter = poly.list.listIterator();

		Term a, b;
		while (listIter.hasNext()) {
			a = listIter.next();

			while (_listIter.hasNext()) {
				b = _listIter.next();
				if (a.getDegree() == b.getDegree()) {
					listnew.add(new Term(a.getCoeff() + b.getCoeff(), a.getDegree()));
					_listIter.remove();
					listIter.remove();
				}
			}
			_listIter = poly.list.listIterator();

		}

		listIter = list.listIterator();
		_listIter = poly.list.listIterator();

		while (listIter.hasNext())
			listnew.add(listIter.next());
		while (_listIter.hasNext())
			listnew.add(_listIter.next());
		return new Polynomial(addTerms);
	}

	public Polynomial multiply(Polynomial poly) {
		ListIterator<Term> listIter = list.listIterator();
		LinkedList<Term> _list = new LinkedList<Term>();
		
		
		
		LinkedList<Term> polyList = poly.list;
		ListIterator<Term> polyIter = polyList.listIterator();
		
		

		
		
		
		
		
		Term x,y;
		y = polyIter.next();
		while (polyIter.hasNext()){
		while (listIter.hasNext()) {
			x = listIter.next();
			_list.add(new Term( y.getCoeff()* x.getCoeff(), y.getDegree() + x.getDegree()));
		}
		y = polyIter.next();
		}

		return new Polynomial(_list);
	}
	
	
	
	
	
	
	

	public Polynomial derivativeTerm() {
		ListIterator<Term> listIter = list.listIterator();
		LinkedList <Term> temp = list;
		ListIterator <Term> tempIter = temp.listIterator();
		Term x;
		while (tempIter.hasNext()) {

			x = tempIter.next();
			if (x.getDegree() == 0) {
				tempIter.remove();
			} else {
				tempIter.set(new Term(x.getDegree() * x.getCoeff(), x.getDegree() - 1));
			}
		}
		return new Polynomial (temp);

	}

	public String toString() {
		list = sort();
		String a = "";
		ListIterator<Term> listIter = list.listIterator();
		Term b;
		while (listIter.hasNext()) {
			b = listIter.next();

			if (b.getDegree() == 0) {
				if (b.getCoeff() >= 0) {

					a = a + "+ " + b.getCoeff() + " ";
				} else {
					a = a + b.getCoeff() + " ";
				}
			} else {

				if (b.getCoeff() >= 0) {

					a = a + "+ " + b + " ";
				} else {
					a = a + b + " ";
				}
			}
		}
		return a;

	}

}
