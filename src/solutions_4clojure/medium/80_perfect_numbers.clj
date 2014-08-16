(defn is-perfect? [n]
  (letfn [(divisors [n] (filter #(zero? (rem n %)) (range 1 n)))]
    (= n (apply + (divisors n)))))

(= (is-perfect? 6) true)

(= (is-perfect? 7) false)

(= (is-perfect? 496) true)

(= (is-perfect? 500) false)

(= (is-perfect? 8128) true)