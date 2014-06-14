;; restrictions: nth

(defn my-nth [arr n] (first (drop n arr)))

(= (my-nth '(4 5 6 7) 2) 6)

(= (my-nth [:a :b :c] 0) :a)

(= (my-nth [1 2 3 4] 1) 2)

(= (my-nth '([1 2] [3 4] [5 6]) 2) [5 6])
