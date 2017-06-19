package entities.letters;

public class FirstTemplate {
    private String[] A;
    private String[] B;
    private String[] C;
    private String[] D;
    private String[] E;
    private String[] F;
    private String[] G;
    private String[] H;
    private String[] I;
    private String[] J;
    private String[] K;
    private String[] L;
    private String[] M;
    private String[] N;
    private String[] O;
    private String[] P;
    private String[] Q;
    private String[] R;
    private String[] S;
    private String[] T;
    private String[] U;
    private String[] V;
    private String[] W;
    private String[] X;
    private String[] Y;
    private String[] Z;
    private String[] INTERRO;

    public FirstTemplate() {
	A = new String[] { " #  ", "# # ", "### ", "# # ", "# # " };
	B = new String[] { "##  ", "# # ", "### ", "# # ", "##  " };
	C = new String[] { " ## ", "#   ", "#   ", "#   ", " ## " };
	D = new String[] { "##  ", "# # ", "# # ", "# # ", "##  " };
	E = new String[] { "### ", "#   ", "##  ", "#   ", "### " };
	F = new String[] { "### ", "#   ", "##  ", "#   ", "#   " };
	G = new String[] { "### ", "#   ", "# ##", "#  #", "####" };
	H = new String[] { "# # ", "# # ", "### ", "# # ", "# # " };
	I = new String[] { " #  ", " #  ", " #  ", " #  ", " #  " };
	J = new String[] { "### ", " #  ", " #  ", " #  ", "##  " };
	K = new String[] { "#  #", "# # ", "##  ", "# # ", "#  #" };
	L = new String[] { "#   ", "#   ", "#   ", "#   ", "### " };
	M = new String[] { "# # ", "### ", "# # ", "# # ", "# # " };
	N = new String[] { "### ", "# # ", "# # ", "# # ", "# # " };

	O = new String[] { " #  ", "# # ", "# # ", "# # ", " #  " };

	P = new String[] { "##  ", "# # ", "##  ", "#   ", "#   " };

	Q = new String[] { " #  ", "# # ", "# # ", " ## ", "  # " };

	R = new String[] { "##  ", "# # ", "##  ", "# # ", "# # " };

	S = new String[] { " ## ", "#   ", " #  ", "  # ", "##  " };

	T = new String[] { "### ", " #  ", " #  ", " #  ", " #  " };

	U = new String[] { "# # ", "# # ", "# # ", "# # ", "### " };

	V = new String[] { "# # ", "# # ", "# # ", "# # ", " #  " };

	W = new String[] { "# # ", "# # ", "### ", "### ", "# # " };

	X = new String[] { "# # ", "# # ", " #  ", "# # ", "# # " };

	Y = new String[] { "# # ", "# # ", " #  ", " #  ", " #  " };

	Z = new String[] { "### ", "  # ", " #  ", "#   ", "### " };

	INTERRO = new String[] { "### ", "  # ", " ## ", "    ", " #  " };
    }

    public String[] getA() {
        return A;
    }

    public void setA(String[] a) {
        A = a;
    }

    public String[] getB() {
        return B;
    }

    public void setB(String[] b) {
        B = b;
    }

    public String[] getC() {
        return C;
    }

    public void setC(String[] c) {
        C = c;
    }

    public String[] getD() {
        return D;
    }

    public void setD(String[] d) {
        D = d;
    }

    public String[] getE() {
        return E;
    }

    public void setE(String[] e) {
        E = e;
    }

    public String[] getF() {
        return F;
    }

    public void setF(String[] f) {
        F = f;
    }

    public String[] getG() {
        return G;
    }

    public void setG(String[] g) {
        G = g;
    }

    public String[] getH() {
        return H;
    }

    public void setH(String[] h) {
        H = h;
    }

    public String[] getI() {
        return I;
    }

    public void setI(String[] i) {
        I = i;
    }

    public String[] getJ() {
        return J;
    }

    public void setJ(String[] j) {
        J = j;
    }

    public String[] getK() {
        return K;
    }

    public void setK(String[] k) {
        K = k;
    }

    public String[] getL() {
        return L;
    }

    public void setL(String[] l) {
        L = l;
    }

    public String[] getM() {
        return M;
    }

    public void setM(String[] m) {
        M = m;
    }

    public String[] getN() {
        return N;
    }

    public void setN(String[] n) {
        N = n;
    }

    public String[] getO() {
        return O;
    }

    public void setO(String[] o) {
        O = o;
    }

    public String[] getP() {
        return P;
    }

    public void setP(String[] p) {
        P = p;
    }

    public String[] getQ() {
        return Q;
    }

    public void setQ(String[] q) {
        Q = q;
    }

    public String[] getR() {
        return R;
    }

    public void setR(String[] r) {
        R = r;
    }

    public String[] getS() {
        return S;
    }

    public void setS(String[] s) {
        S = s;
    }

    public String[] getT() {
        return T;
    }

    public void setT(String[] t) {
        T = t;
    }

    public String[] getU() {
        return U;
    }

    public void setU(String[] u) {
        U = u;
    }

    public String[] getV() {
        return V;
    }

    public void setV(String[] v) {
        V = v;
    }

    public String[] getW() {
        return W;
    }

    public void setW(String[] w) {
        W = w;
    }

    public String[] getX() {
        return X;
    }

    public void setX(String[] x) {
        X = x;
    }

    public String[] getY() {
        return Y;
    }

    public void setY(String[] y) {
        Y = y;
    }

    public String[] getZ() {
        return Z;
    }

    public void setZ(String[] z) {
        Z = z;
    }

    public String[] getINTERRO() {
        return INTERRO;
    }

    public void setINTERRO(String[] iNTERRO) {
        INTERRO = iNTERRO;
    }

    public void convert(String text) {
	int nbLine = 0;
	String input = text.toUpperCase();
	String[] inputSplit = input.split("");

	for (int i = 0; i < inputSplit.length; i++) {
	    if (inputSplit[i].equals("A") && nbLine == 0) {
		System.out.print(A[0]);
	    } else if (inputSplit[i].equals("A") && nbLine == 1) {
		System.out.print(A[1]);
	    } else if (inputSplit[i].equals("A") && nbLine == 2) {
		System.out.print(A[2]);
	    } else if (inputSplit[i].equals("A") && nbLine == 3) {
		System.out.print(A[3]);
	    } else if (inputSplit[i].equals("A") && nbLine == 4) {
		System.out.print(A[4]);
	    }

	    else if (inputSplit[i].equals("B") && nbLine == 0) {
		System.out.print(B[0]);
	    } else if (inputSplit[i].equals("B") && nbLine == 1) {
		System.out.print(B[1]);
	    } else if (inputSplit[i].equals("B") && nbLine == 2) {
		System.out.print(B[2]);
	    } else if (inputSplit[i].equals("B") && nbLine == 3) {
		System.out.print(B[3]);
	    } else if (inputSplit[i].equals("B") && nbLine == 4) {
		System.out.print(B[4]);
	    }

	    else if (inputSplit[i].equals("C") && nbLine == 0) {
		System.out.print(C[0]);
	    } else if (inputSplit[i].equals("C") && nbLine == 1) {
		System.out.print(C[1]);
	    } else if (inputSplit[i].equals("C") && nbLine == 2) {
		System.out.print(C[2]);
	    } else if (inputSplit[i].equals("C") && nbLine == 3) {
		System.out.print(C[3]);
	    } else if (inputSplit[i].equals("C") && nbLine == 4) {
		System.out.print(C[4]);
	    }

	    else if (inputSplit[i].equals("D") && nbLine == 0) {
		System.out.print(D[0]);
	    } else if (inputSplit[i].equals("D") && nbLine == 1) {
		System.out.print(D[1]);
	    } else if (inputSplit[i].equals("D") && nbLine == 2) {
		System.out.print(D[2]);
	    } else if (inputSplit[i].equals("D") && nbLine == 3) {
		System.out.print(D[3]);
	    } else if (inputSplit[i].equals("D") && nbLine == 4) {
		System.out.print(D[4]);
	    }

	    else if (inputSplit[i].equals("E") && nbLine == 0) {
		System.out.print(E[0]);
	    } else if (inputSplit[i].equals("E") && nbLine == 1) {
		System.out.print(E[1]);
	    } else if (inputSplit[i].equals("E") && nbLine == 2) {
		System.out.print(E[2]);
	    } else if (inputSplit[i].equals("E") && nbLine == 3) {
		System.out.print(E[3]);
	    } else if (inputSplit[i].equals("E") && nbLine == 4) {
		System.out.print(E[4]);
	    }

	    else if (inputSplit[i].equals("F") && nbLine == 0) {
		System.out.print(F[0]);
	    } else if (inputSplit[i].equals("F") && nbLine == 1) {
		System.out.print(F[1]);
	    } else if (inputSplit[i].equals("F") && nbLine == 2) {
		System.out.print(F[2]);
	    } else if (inputSplit[i].equals("F") && nbLine == 3) {
		System.out.print(F[3]);
	    } else if (inputSplit[i].equals("F") && nbLine == 4) {
		System.out.print(F[4]);
	    }

	    else if (inputSplit[i].equals("G") && nbLine == 0) {
		System.out.print(G[0]);
	    } else if (inputSplit[i].equals("G") && nbLine == 1) {
		System.out.print(G[1]);
	    } else if (inputSplit[i].equals("G") && nbLine == 2) {
		System.out.print(G[2]);
	    } else if (inputSplit[i].equals("G") && nbLine == 3) {
		System.out.print(G[3]);
	    } else if (inputSplit[i].equals("G") && nbLine == 4) {
		System.out.print(G[4]);
	    }

	    else if (inputSplit[i].equals("H") && nbLine == 0) {
		System.out.print(H[0]);
	    } else if (inputSplit[i].equals("H") && nbLine == 1) {
		System.out.print(H[1]);
	    } else if (inputSplit[i].equals("H") && nbLine == 2) {
		System.out.print(H[2]);
	    } else if (inputSplit[i].equals("H") && nbLine == 3) {
		System.out.print(H[3]);
	    } else if (inputSplit[i].equals("H") && nbLine == 4) {
		System.out.print(H[4]);
	    }

	    else if (inputSplit[i].equals("I") && nbLine == 0) {
		System.out.print(I[0]);
	    } else if (inputSplit[i].equals("I") && nbLine == 1) {
		System.out.print(I[1]);
	    } else if (inputSplit[i].equals("I") && nbLine == 2) {
		System.out.print(I[2]);
	    } else if (inputSplit[i].equals("I") && nbLine == 3) {
		System.out.print(I[3]);
	    } else if (inputSplit[i].equals("I") && nbLine == 4) {
		System.out.print(I[4]);
	    }

	    else if (inputSplit[i].equals("J") && nbLine == 0) {
		System.out.print(J[0]);
	    } else if (inputSplit[i].equals("J") && nbLine == 1) {
		System.out.print(J[1]);
	    } else if (inputSplit[i].equals("J") && nbLine == 2) {
		System.out.print(J[2]);
	    } else if (inputSplit[i].equals("J") && nbLine == 3) {
		System.out.print(J[3]);
	    } else if (inputSplit[i].equals("J") && nbLine == 4) {
		System.out.print(J[4]);
	    }

	    else if (inputSplit[i].equals("K") && nbLine == 0) {
		System.out.print(K[0]);
	    } else if (inputSplit[i].equals("K") && nbLine == 1) {
		System.out.print(K[1]);
	    } else if (inputSplit[i].equals("K") && nbLine == 2) {
		System.out.print(K[2]);
	    } else if (inputSplit[i].equals("K") && nbLine == 3) {
		System.out.print(K[3]);
	    } else if (inputSplit[i].equals("K") && nbLine == 4) {
		System.out.print(K[4]);
	    }

	    else if (inputSplit[i].equals("L") && nbLine == 0) {
		System.out.print(L[0]);
	    } else if (inputSplit[i].equals("L") && nbLine == 1) {
		System.out.print(L[1]);
	    } else if (inputSplit[i].equals("L") && nbLine == 2) {
		System.out.print(L[2]);
	    } else if (inputSplit[i].equals("L") && nbLine == 3) {
		System.out.print(L[3]);
	    } else if (inputSplit[i].equals("L") && nbLine == 4) {
		System.out.print(L[4]);
	    }

	    else if (inputSplit[i].equals("M") && nbLine == 0) {
		System.out.print(M[0]);
	    } else if (inputSplit[i].equals("M") && nbLine == 1) {
		System.out.print(M[1]);
	    } else if (inputSplit[i].equals("M") && nbLine == 2) {
		System.out.print(M[2]);
	    } else if (inputSplit[i].equals("M") && nbLine == 3) {
		System.out.print(M[3]);
	    } else if (inputSplit[i].equals("M") && nbLine == 4) {
		System.out.print(M[4]);
	    }

	    else if (inputSplit[i].equals("N") && nbLine == 0) {
		System.out.print(N[0]);
	    } else if (inputSplit[i].equals("N") && nbLine == 1) {
		System.out.print(N[1]);
	    } else if (inputSplit[i].equals("N") && nbLine == 2) {
		System.out.print(N[2]);
	    } else if (inputSplit[i].equals("N") && nbLine == 3) {
		System.out.print(N[3]);
	    } else if (inputSplit[i].equals("N") && nbLine == 4) {
		System.out.print(N[4]);
	    }

	    else if (inputSplit[i].equals("O") && nbLine == 0) {
		System.out.print(O[0]);
	    } else if (inputSplit[i].equals("O") && nbLine == 1) {
		System.out.print(O[1]);
	    } else if (inputSplit[i].equals("O") && nbLine == 2) {
		System.out.print(O[2]);
	    } else if (inputSplit[i].equals("O") && nbLine == 3) {
		System.out.print(O[3]);
	    } else if (inputSplit[i].equals("O") && nbLine == 4) {
		System.out.print(O[4]);
	    }

	    else if (inputSplit[i].equals("P") && nbLine == 0) {
		System.out.print(P[0]);
	    } else if (inputSplit[i].equals("P") && nbLine == 1) {
		System.out.print(P[1]);
	    } else if (inputSplit[i].equals("P") && nbLine == 2) {
		System.out.print(P[2]);
	    } else if (inputSplit[i].equals("P") && nbLine == 3) {
		System.out.print(P[3]);
	    } else if (inputSplit[i].equals("P") && nbLine == 4) {
		System.out.print(P[4]);
	    }

	    else if (inputSplit[i].equals("Q") && nbLine == 0) {
		System.out.print(Q[0]);
	    } else if (inputSplit[i].equals("Q") && nbLine == 1) {
		System.out.print(Q[1]);
	    } else if (inputSplit[i].equals("Q") && nbLine == 2) {
		System.out.print(Q[2]);
	    } else if (inputSplit[i].equals("Q") && nbLine == 3) {
		System.out.print(Q[3]);
	    } else if (inputSplit[i].equals("Q") && nbLine == 4) {
		System.out.print(Q[4]);
	    }

	    else if (inputSplit[i].equals("R") && nbLine == 0) {
		System.out.print(R[0]);
	    } else if (inputSplit[i].equals("R") && nbLine == 1) {
		System.out.print(R[1]);
	    } else if (inputSplit[i].equals("R") && nbLine == 2) {
		System.out.print(R[2]);
	    } else if (inputSplit[i].equals("R") && nbLine == 3) {
		System.out.print(R[3]);
	    } else if (inputSplit[i].equals("R") && nbLine == 4) {
		System.out.print(R[4]);
	    }

	    else if (inputSplit[i].equals("S") && nbLine == 0) {
		System.out.print(S[0]);
	    } else if (inputSplit[i].equals("S") && nbLine == 1) {
		System.out.print(S[1]);
	    } else if (inputSplit[i].equals("S") && nbLine == 2) {
		System.out.print(S[2]);
	    } else if (inputSplit[i].equals("S") && nbLine == 3) {
		System.out.print(S[3]);
	    } else if (inputSplit[i].equals("S") && nbLine == 4) {
		System.out.print(S[4]);
	    }

	    else if (inputSplit[i].equals("T") && nbLine == 0) {
		System.out.print(T[0]);
	    } else if (inputSplit[i].equals("T") && nbLine == 1) {
		System.out.print(T[1]);
	    } else if (inputSplit[i].equals("T") && nbLine == 2) {
		System.out.print(T[2]);
	    } else if (inputSplit[i].equals("T") && nbLine == 3) {
		System.out.print(T[3]);
	    } else if (inputSplit[i].equals("T") && nbLine == 4) {
		System.out.print(T[4]);
	    }

	    else if (inputSplit[i].equals("U") && nbLine == 0) {
		System.out.print(U[0]);
	    } else if (inputSplit[i].equals("U") && nbLine == 1) {
		System.out.print(U[1]);
	    } else if (inputSplit[i].equals("U") && nbLine == 2) {
		System.out.print(U[2]);
	    } else if (inputSplit[i].equals("U") && nbLine == 3) {
		System.out.print(U[3]);
	    } else if (inputSplit[i].equals("U") && nbLine == 4) {
		System.out.print(U[4]);
	    }

	    else if (inputSplit[i].equals("V") && nbLine == 0) {
		System.out.print(V[0]);
	    } else if (inputSplit[i].equals("V") && nbLine == 1) {
		System.out.print(V[1]);
	    } else if (inputSplit[i].equals("V") && nbLine == 2) {
		System.out.print(V[2]);
	    } else if (inputSplit[i].equals("V") && nbLine == 3) {
		System.out.print(V[3]);
	    } else if (inputSplit[i].equals("V") && nbLine == 4) {
		System.out.print(V[4]);
	    }

	    else if (inputSplit[i].equals("W") && nbLine == 0) {
		System.out.print(W[0]);
	    } else if (inputSplit[i].equals("W") && nbLine == 1) {
		System.out.print(W[1]);
	    } else if (inputSplit[i].equals("W") && nbLine == 2) {
		System.out.print(W[2]);
	    } else if (inputSplit[i].equals("W") && nbLine == 3) {
		System.out.print(W[3]);
	    } else if (inputSplit[i].equals("W") && nbLine == 4) {
		System.out.print(W[4]);
	    }

	    else if (inputSplit[i].equals("X") && nbLine == 0) {
		System.out.print(X[0]);
	    } else if (inputSplit[i].equals("X") && nbLine == 1) {
		System.out.print(X[1]);
	    } else if (inputSplit[i].equals("X") && nbLine == 2) {
		System.out.print(X[2]);
	    } else if (inputSplit[i].equals("X") && nbLine == 3) {
		System.out.print(X[3]);
	    } else if (inputSplit[i].equals("X") && nbLine == 4) {
		System.out.print(X[4]);
	    }

	    else if (inputSplit[i].equals("Y") && nbLine == 0) {
		System.out.print(Y[0]);
	    } else if (inputSplit[i].equals("Y") && nbLine == 1) {
		System.out.print(Y[1]);
	    } else if (inputSplit[i].equals("Y") && nbLine == 2) {
		System.out.print(Y[2]);
	    } else if (inputSplit[i].equals("Y") && nbLine == 3) {
		System.out.print(Y[3]);
	    } else if (inputSplit[i].equals("Y") && nbLine == 4) {
		System.out.print(Y[4]);
	    }

	    else if (inputSplit[i].equals("Z") && nbLine == 0) {
		System.out.print(Z[0]);
	    } else if (inputSplit[i].equals("Z") && nbLine == 1) {
		System.out.print(Z[1]);
	    } else if (inputSplit[i].equals("Z") && nbLine == 2) {
		System.out.print(Z[2]);
	    } else if (inputSplit[i].equals("Z") && nbLine == 3) {
		System.out.print(Z[3]);
	    } else if (inputSplit[i].equals("Z") && nbLine == 4) {
		System.out.print(Z[4]);
	    }

	    else if (nbLine == 0) {
		System.out.print(INTERRO[0]);
	    } else if (nbLine == 1) {
		System.out.print(INTERRO[1]);
	    } else if (nbLine == 2) {
		System.out.print(INTERRO[2]);
	    } else if (nbLine == 3) {
		System.out.print(INTERRO[3]);
	    } else if (nbLine == 4) {
		System.out.print(INTERRO[4]);
	    }

	    if (i == inputSplit.length - 1) {
		System.out.print("\n");

		nbLine++;

		i = -1;
	    }

	    if (nbLine == 5) {
		i = inputSplit.length;
	    }
	}
    }
}
