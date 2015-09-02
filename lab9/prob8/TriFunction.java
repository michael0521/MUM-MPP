package lab9.prob8;

@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);
}
