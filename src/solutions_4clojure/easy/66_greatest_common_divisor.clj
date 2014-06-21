(defn gcd [f s]
  (loop [lastcd 1
         n 1]
    (if (or (> n f) (> n s))
      lastcd
      (recur (if (= 0 (mod f n) (mod s n))
               n
               lastcd)
             (inc n)))))


(defn gcd2 [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))


(= (gcd 2 4) 2)

(= (gcd 10 5) 5)

(= (gcd 5 7) 1)

(= (gcd 1023 858) 33)
