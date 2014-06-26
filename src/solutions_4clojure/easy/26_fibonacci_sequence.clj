;; ugly
(defn fiblist [n]
  (map (fn fib [n] (if (<= n 1)
                     1
                     (+ (fib (- n 1))
                        (fib (- n 2)))))
       (range n)))

;; corecursion
(def fib
  (lazy-cat [1 1] (map + fib (rest fib))))


(defn fiblist [n]
  (take n fib))

(fiblist 3)

(= (fiblist 3) '(1 1 2))

(= (fiblist 6) '(1 1 2 3 5 8))

(= (fiblist 8) '(1 1 2 3 5 8 13 21))
